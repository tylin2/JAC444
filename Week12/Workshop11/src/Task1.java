/**********************************************
Workshop 11
Course:JAV444 - W
Last Name:Ting-Yeh
First Name:Lin
ID:141726182
Section:NEE
This assignment represents my own work in accordance with Seneca Academic Policy.
TING-YEH LIN
Date:2021/04/15
**********************************************/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
	static final String AGSStudent = "AGSStudent.db";
	static final String TABLE_AGSStudent = "AGSStudent";
	static final String ExerciseAssigned = "ExerciseAssigned.db";
	static final String TABLE_ExerciseAssigned = "ExerciseAssigned";
	static final String AGSLog = "AGSLog.db";
	static final String TABLE_AGSLog = "AGSLog";
	static final String CONNECTION_STRING = "jdbc:sqlite:C:\\Users\\HP\\Documents\\2021_W_JAC444\\Workshop11\\src\\";
	
	public static void main(String[] args) throws SQLException {
		
		Connection conn = connect(AGSStudent);
		Statement stAGSS = state(conn);
		/*stAGSS.execute("Create table IF NOT Exists " + TABLE_AGSStudent 
				+ " (username varchar(50) not null, " 
				+ "password varchar(50) not null, " 
				+ "fullname varchar(200) not null, " 
				+ "instructorEmail varchar(100) not null, " 
				+ "constraint pkAGSStudent primary key (username))");
		stAGSS.execute(insterAGSStudent("abc","p1","Kyle Wright","a@senencacollege.ca"));
		stAGSS.execute(insterAGSStudent("cde","p2","Yao Mi","c@senecacollege.ca"));
		stAGSS.execute(insterAGSStudent("wbc","p3","Jack Jill","w@senecacollege.ca"));*/
		//stAGSS.execute("Delete from AGSStudent");
		ArrayList<AGSStudent> agss = new ArrayList<>();
		ResultSet rsAGSS = stAGSS.executeQuery("select * from " + TABLE_AGSStudent);
		while(rsAGSS.next()) {
			agss.add(new AGSStudent(rsAGSS.getString(1), rsAGSS.getString(2),rsAGSS.getString(3),rsAGSS.getString(4)));
		}
		
		conn = connect(ExerciseAssigned);
		Statement stEA = state(conn);
		/*stEA.execute("Create table IF NOT Exists " + TABLE_ExerciseAssigned
				+ " (instructorEmail varchar(100), " 
				+ "exerciseName varchar(100), " 
				+ "maxscore double default 10, "  
				+ "constraint pkCustomExercise primary key (instructorEmail, exerciseName))");
		stEA.execute(insterExerciseAssigned("a@senencacollege.ca","e1",10));
		stEA.execute(insterExerciseAssigned("a@senencacollege.ca","e2",10));
		stEA.execute(insterExerciseAssigned("w@senecacollege.ca","e1",4));
		stEA.execute(insterExerciseAssigned("w@senecacollege.ca","e4",20));*/
		//stEA.execute("Delete from ExerciseAssigned");
		ArrayList<ExerciseAssigned> exA = new ArrayList<>();
		ResultSet rsEA = stEA.executeQuery("select * from " + TABLE_ExerciseAssigned);
		while(rsEA.next()) {
			exA.add(new ExerciseAssigned(rsEA.getString(1), rsEA.getString(2),rsEA.getDouble(3)));
		}
		
		conn = connect(AGSLog);
		Statement stAGSL = state(conn);
		/*stAGSL.execute("Create table IF NOT Exists " + TABLE_AGSLog
				+ " (username varchar(50), " 
				+ "exerciseName varchar(100), " 
				+ "score double default null, " 
				+ "submitted bit default 0, "  
				+ "constraint pkLog primary key (username, exerciseName))");
		stAGSL.execute(insterAGSLog("abc","e1",9,1));
		stAGSL.execute(insterAGSLog("wbc","e2",7,1));*/
		//stAGSL.execute("Delete from AGSLog");
		
		//Join
		ArrayList<AGSLog> agsl = new ArrayList<>();
		ResultSet rsAGSL = stAGSL.executeQuery("select * from " + TABLE_AGSLog);
		while(rsAGSL.next()) {
			agsl.add(new AGSLog(rsAGSL.getString(1), rsAGSL.getString(2),rsAGSL.getDouble(3),rsAGSL.getDouble(4)));
		}
		
		ArrayList<AGSLog> nlog = new ArrayList<>();
		for(AGSStudent a: agss) {
			for(ExerciseAssigned e: exA) {
				if(a.instructorEmail.equals(e.instructorEmail)) {
					nlog.add(new AGSLog(a.username,e.exerciseName,0,0));
				}
			}			
		}		
		
		Iterator<AGSLog> i = nlog.iterator();
		while (i.hasNext()) {
			AGSLog l = i.next();
			for(AGSLog e : agsl) {
				if(e.username.equals(l.username)&&e.exerciseName.equals(l.exerciseName)) {
					i.remove();
				}
			}
		}
		
		for(AGSLog n: nlog) {
			stAGSL.execute(insterAGSLog(n.username,n.exerciseName,n.score,n.submitted));
		}
		
		stAGSL.close();
		stAGSS.close();		
		stEA.close();
		conn.close();
		
	}
	
	public static Connection connect(String dbName) throws SQLException {
		return DriverManager.getConnection( CONNECTION_STRING + dbName);
	}
	
	public static Statement state(Connection conn) throws SQLException {
		return conn.createStatement();
	}
	
	public static String insterAGSStudent(String username, String password, String fullname, String email){
		return "Insert into AGSStudent (username, password, fullname, instructorEmail) values ('" + username + "', '" + password + "', '" + fullname + "', '" + email + "')";
	}
	
	public static String insterExerciseAssigned(String email, String exerciseName, double maxscore){		
		return "Insert into ExerciseAssigned (instructorEmail, exerciseName, maxscore) values ('" + email + "', '" + exerciseName + "', '" + maxscore + "')";
	}
	
	public static String insterAGSLog(String username, String exerciseName, double score, double submitted){		
		return "Insert into AGSLog (username, exerciseName, score, Submitted) values ('" + username + "', '" + exerciseName + "', '" + score+ "', '" + submitted + "')";
	}
	
	static class AGSStudent{
		String username;
		String password;
		String fullname;
		String instructorEmail;
		
		public AGSStudent(String username, String password, String fullname, String instructorEmail) {			
			this.username = username;
			this.password = password;
			this.fullname = fullname;
			this.instructorEmail = instructorEmail;
		}

		@Override
		public String toString() {
			return "AGSStudent [username=" + username + ", password=" + password + ", fullname=" + fullname
					+ ", instructorEmail=" + instructorEmail + "]";
		}
	}
	
	static class ExerciseAssigned {
		String instructorEmail;
		String exerciseName;
		double maxScore;
		
		public ExerciseAssigned(String instructorEmail, String exerciseName, double maxScore) {
			this.instructorEmail = instructorEmail;
			this.exerciseName = exerciseName;
			this.maxScore = maxScore;
		}

		@Override
		public String toString() {
			return "ExerciseAssigned [instructorEmail=" + instructorEmail + ", exerciseName=" + exerciseName
					+ ", maxScore=" + maxScore + "]";
		}
	}
	
	static class AGSLog {
		String username;
		String exerciseName;
		double score;
		double submitted;
		
		public AGSLog(String username, String exerciseName, double score, double submitted) {
			super();
			this.username = username;
			this.exerciseName = exerciseName;
			this.score = score;
			this.submitted = submitted;
		}

		@Override
		public String toString() {
			return "AGSLog [username=" + username + ", exerciseName=" + exerciseName + ", score=" + score
					+ ", submitted=" + submitted + "]";
		}
		
	}
	
}
