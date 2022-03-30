/**********************************************
Workshop 8
Course:JAV444 - W
Last Name:Lin
First Name:Ting-Yeh
ID:141726182
Section:NEE
This assignment represents my own work in accordance with Seneca Academic Policy.
TING-YEH LIN
Date:2021/03/27
**********************************************/

package ca.senecacollege.task2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		int found = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a country: ");
		String country = in.nextLine();
		for(int i = 0; i < map.length; i++) {
			if(country.toLowerCase().equals(map[i][0].toLowerCase())) {
				System.out.println("The capital of " + country + " is " + map[i][1]);
				found = 1;
				break;
			}
		}
		if(found == 0) {
			System.out.println("No information for this country");
		}

	}
	
	 private static String[][] map = {
			 {"Afghanistan", "Kabul"},
			 {"Algeria", "Algiers"},
			 {"Angola", "Luanda"},
			 {"Armenia", "Yerevan"},
			 {"Australia", "Canberra"},
			 {"Austria", "Vienna"},
			 {"Azerbaijan", "Baku"},
			 {"Bahamas", "Nassau"},
			 {"Bahrain", "Manama"},
			 {"Bangladesh", "Dhaka"},
			 {"Barbados", "Bridgetown"},
			 {"Belarus", "Minsk"},
			 {"Belgium", "Brussels"},
			 {"Belize", "Belmopan"},
			 {"Bhutan", "Thimphu"},
			 {"Botswana", "Gaborone"},
			 {"Brazil", "Brasilia"},
			 {"Bulgaria", "Sofia"},
			 {"Cameroon", "Yaounde"},
			 {"Canada", "Ottawa"},
			 {"Chad", "N'Djamena"},
			 {"Chile", "Santiago"},
			 {"China", "Beijing"},
			 {"Colombia", "Bogota"},
			 {"Comoros", "Moroni"},
			 {"Croatia", "Zagreb"},
			 {"Cuba", "Havana"},
			 {"Cyprus", "Nicosia"},
			 {"Denmark", "Copenhagen"},
			 {"Djibouti", "Djibouti"},
			 {"Dominica", "Roseau"},
			 {"Ecuador", "Quito"},
			 {"Egypt", "Cairo"},
			 {"Eritrea", "Asmara"},
			 {"Estonia", "Tallinn"},
			 {"Fiji", "Suva"},
			 {"Finland", "Helsinki"},
			 {"France", "Paris"},
			 {"Gabon", "Libreville"},
			 {"Gambia", "Banjul"},
			 {"Georgia", "Tbilisi"},
			 {"Germany", "Berlin"},
			 {"Ghana", "Accra"},
			 {"Greece", "Athens"},
			 {"Guinea", "Conakry"},
			 {"Guinea-Bissau", "Bissau"},
			 {"Guyana", "Georgetown"},
			 {"Honduras", "Tegucigalpa"},
			 {"Hungary", "Budapest"},
			 {"Iceland", "Reykjavik"},
			 {"Indonesia", "Jakarta"},
			 {"Iran", "Tehran"},
			 {"Iraq", "Baghdad"},
			 {"Ireland", "Dublin"},
			 {"Italy", "Rome"},
			 {"Jamaica", "Kingston"},
			 {"Japan", "Tokyo"},
			 {"Jordan", "Amman"},
			 {"Kenya", "Nairobi"},
			 {"Kosovo", "Pristina"},
			 {"Kyrgyzstan", "Bishkek"},
			 {"Laos", "Vientiane"},
			 {"Latvia", "Riga"},
			 {"Lebanon", "Beirut"},
			 {"Lesotho", "Maseru"},
			 {"Liberia", "Monrovia"},
			 {"Libya", "Tripoli"},
			 {"Liechtenstein", "Vaduz"},
			 {"Lithuania", "Vilnius"},
			 {"Luxembourg", "Luxembourg"},
			 {"Madagascar", "Antananarivo"},
			 {"Malawi", "Lilongwe"},
			 {"Maldives", "Male"},
			 {"Mali", "Bamako"},
			 {"Malta", "Valletta"},
			 {"Mauritania", "Nouakchott"},
			 {"Moldova", "Chisinau"},
			 {"Monaco", "Monaco"},
			 {"Mongolia", "Ulaanbaatar"},
			 {"Montenegro", "Podgorica"},
			 {"Morocco", "Rabat"},
			 {"Mozambique", "Maputo"},
			 {"Namibia", "Windhoek"},
			 {"Nepal", "Kathmandu"},
			 {"New Zealand", "Wellington"},
			 {"Nicaragua", "Managua"},
			 {"Niger", "Niamey"},
			 {"Nigeria", "Abuja"},
			 {"North Korea", "Pyongyang"},
			 {"Norway", "Oslo"},
			 {"Oman", "Muscat"},
			 {"Pakistan", "Islamabad"},
			 {"Palau", "Melekeok"},
			 {"Paraguay", "Asuncion"},
			 {"Peru", "Lima"},
			 {"Philippines", "Manila"},
			 {"Poland", "Warsaw"},
			 {"Portugal", "Lisbon"},
			 {"Qatar", "Doha"},
			 {"Romania", "Bucharest"},
			 {"Russia", "Moscow"},
			 {"Rwanda", "Kigali"},
			 {"Saint Kitts and Nevis", "Basseterre"},
			 {"Saint Lucia", "Castries"},
			 {"Saint Vincent and the Grenadines", "Kingstown"},
			 {"Samoa", "Apia"},
			 {"Saudi Arabia", "Riyadh"},
			 {"Senegal", "Dakar"},
			 {"Serbia", "Belgrade"},
			 {"Seychelles", "Victoria"},
			 {"Sierra Leone", "Freetown"},
			 {"Singapore", "Singapore"},
			 {"Slovakia", "Bratislava"},
			 {"Slovenia", "Ljubljana"},
			 {"Solomon Islands", "Honiara"},
			 {"Somalia", "Mogadishu"},
			 {"South Korea", "Seoul"},
			 {"South Sudan", "Juba"},
			 {"Spain", "Madrid"},
			 {"Sudan", "Khartoum"},
			 {"Suriname", "Paramaribo"},
			 {"Sweden", "Stockholm"},
			 {"Switzerland", "Bern"},
			 {"Syria", "Damascus"},
			 {"Taiwan", "Taipei"},
			 {"Tajikistan", "Dushanbe"},
			 {"Thailand", "Bangkok"},
			 {"Togo", "Lome"},
			 {"Tonga", "Nuku'alofa"},
			 {"Tunisia", "Tunis"},
			 {"Turkey", "Ankara"},
			 {"Turkmenistan", "Ashgabat"},
			 {"Uganda", "Kampala"},
			 {"Ukraine", "Kiev"},
			 {"United Kingdom", "London"},
			 {"Uruguay", "Montevideo"},
			 {"Uzbekistan", "Tashkent"},
			 {"Venezuela", "Caracas"},
			 {"Vietnam", "Hanoi"},
			 {"Zambia", "Lusaka"},
			 {"Zimbabwe", "Harare"}			 
	 };

}
