import java.util.Scanner;

public class NokiaMenu{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		String menuFunctions = """
		
List of menu functions

Press 1 for Phone book
Press 2 for Message 
Press 3 for Chat
Press 4 for Call register
Press 5 for Tones
Press 6 for Settings
Press 7 for Call divert
Press 8 for Music
Press 9 for Games
Press 10 for Calculator
Press 11 for Reminders
Press 12 for Clock
Press 13 for Profiles
Press 14 for WAP services
Press 15 for SIM services
Press 16 to exit the menu function

Enter your preferred option:  """;

		System.out.println(menuFunctions);
		int menuFunctionOption = input.nextInt();

		switch(menuFunctionOption){

			case 1 -> {

				String phoneBookMenu = """

Phone book menu 

Press 1 to search 
Press 2 for Service Number
Press 3 to add name 
Press 4 to erase 
Press 5 to edit
Press 6 to copy
Press 7 to assign tone
Press 8 to send business card
Press 9 for Options
Press 10 for Speed dials
Press 11 for Voice tags

Enter your preferred option:  """;
 
				System.out.println(phoneBookMenu);
				int phoneBookMenuOption = input.nextInt();

				switch(phoneBookMenuOption){

					case 1 -> System.out.println("You're now viewing names and phone numbers");
					case 2 -> System.out.println("Here's the service number of your service provider");
					case 3 -> System.out.println("You're now saving a name and phone number");
					case 4 -> System.out.println("You're about to delete selected contact");
					case 5 -> System.out.println("You're now modifying selected contactact");
					case 6 -> System.out.println("You're now copying selected contact");
					case 7 -> System.out.println("You're about to set the ringing tone");
					case 8 -> System.out.println("You're about to send your name and phone number as business card");
					case 9 -> {

						String optionsMenu = """

Options menu

Press 1 for Memory in use
Press 2 for Type of view
Press 3 for Memory status

Enter your preferred option:  """;
 
						System.out.println(optionsMenu);
						int optionsMenuOption = input.nextInt();

						switch(optionsMenuOption){

							case 1 -> System.out.println("You're about to select where to save your contacts");
							case 2 -> System.out.println("You're about to choose the display mode");
							case 3 -> System.out.println("You're now viewing how many contacts you've saved and how many more you can save");

						}

					}

					case 10 -> System.out.println("You can now assign numbers to speed dial keys");
					case 11 -> {

						String voiceTagsMenu = """

Voice tags menu

Press 1 to record a voice tag
Press 2 to make a call using a voice tag

Enter your preferred option:  """;
 
						System.out.println(voiceTagsMenu);
						int voiceTagsMenuOption = input.nextInt();

						switch(voiceTagsMenuOption){

							case 1 -> System.out.println("You can now record a voice tag");
							case 2 -> System.out.println("You can now make a call using a voice tag");

						}

					}





				}



			}
			
			case 2 -> {

				String messageMenu = """

Message menu 

Press 1 to write and send messages 
Press 2 to access your inbox 
Press 3 to access your outbox 
Press 4 for Picture messages 
Press 5 for Templates
Press 6 for Smileys
Press 7 for Message settings
Press 8 for Info service
Press 9 for Voice mailbox number
Press 10 for Service command editor

Enter your preferred option:  """;
 
				System.out.println(messageMenu);
				int messageMenuOption = input.nextInt();

				switch(messageMenuOption){

					case 1 -> System.out.println("You can now write and send a message");
					case 2 -> System.out.println("Here are your received messages");
					case 3 -> System.out.println("Here are your sent messages");
					case 4 -> System.out.println("You can now send and view picture messages");
					case 5 -> System.out.println("Here are some message templates");
					case 6 -> System.out.println("Here are the available smileys");
					case 7 -> {

						String messageSettingsMenu = """

Message settings menu

Press 1 for Set 1
Press 2 for Common

Enter your preferred option:  """;
 
						System.out.println(messageSettingsMenu);
						int messageSettingsMenuOption = input.nextInt();

						switch(messageSettingsMenuOption){

							case 1 -> {

								String set1Menu = """

Set 1 menu

Press 1 for Message centre number
Press 2 for Messages sent as
Press 3 for Message validity

Enter your preferred option:  """;
 
								System.out.println(set1Menu);
								int set1MenuOption = input.nextInt();

								switch(set1MenuOption){

									case 1 -> System.out.println("Here's your message centre number");
									case 2 -> System.out.println("You can now choose your message format");
									case 3 -> System.out.println("You're now viewing your message validity period");

								}


							}

							case 2 -> {

								String commonMenu = """

Common menu

Press 1 for Delivery reports
Press 2 for Reply via the same centre
Press 3 for Character support

Enter your preferred option:  """;
 
								System.out.println(commonMenu);
								int commonMenuOption = input.nextInt();

								switch(commonMenuOption){

									case 1 -> System.out.println("You can now request delivery reports");
									case 2 -> System.out.println("You can now now choose to send replies through the same centre");
									case 3 -> System.out.println("You can now send messages using special characters");

								}


							}



						}


					}

					case 8 -> System.out.println("You're now viewing the information service");
					case 9 -> System.out.println("Here's your voice mailbox number");
					case 10 -> System.out.println("You're now in the service command editor");

				}

			}



			case 3 -> System.out.println("You're now in Chat");

			case 4 -> {

				String callRegisterMenu = """

Call register menu

Press 1 for Missed calls
Press 2 for Received calls
Press 3 for Dialled numbers
Press 4 to erase recent call lists
Press 5 to show call duration
Press 6 to show call costs
Press 7 for Call cost settings
Press 8 for Prepaid credit

Enter your preferred option:  """;
 
				System.out.println(callRegisterMenu);
				int callRegisterMenuOption = input.nextInt();

				switch(callRegisterMenuOption){

					case 1 -> System.out.println("Here's a list of the calls you missed");
					case 2 -> System.out.println("Here's a list of the calls you answered");
					case 3 -> System.out.println("Here are the numbers you called");
					case 4 -> System.out.println("You're about to erase your recent call list");
					case 5 -> {

						String callDurationMenu = """

Call duration menu

Press 1 for Last call duration
Press 2 for All calls' duration
Press 3 for Received calls’ duration
Press 4 for Dialled calls’ duration
Press 5 to clear timers

Enter your preferred option:  """;

						System.out.println(callDurationMenu);
						int callDurationMenuOption = input.nextInt();

						switch(callDurationMenuOption){

							case 1 -> System.out.println("You're now viewing the time spent on the last call");
							case 2 -> System.out.println("You're now viewing the time spent on all calls");
							case 3 -> System.out.println("Here are the numbers you called");
							case 4 -> System.out.println("You're now viewing the time spent on calls you made");
							case 5 -> System.out.println("You're about to reset call timers");
						}

					}
					case 6 -> {
						String callCostsMenu = """

Call costs menu

Press 1 for Last call cost
Press 2 for All calls' cost
Press 3 to clear counters

Enter your preferred option:  """;

						System.out.println(callCostsMenu);
						int callCostsMenuOption = input.nextInt();

						switch(callCostsMenuOption){

							case 1 -> System.out.println("You're now viewing the amount spent on the last call");
							case 2 -> System.out.println("You're now viewing the amount spent on all calls");
							case 3 -> System.out.println("You're about to reset cost counter");

						}


					}
					case 7 -> {

						String callCostSettingsMenu = """

Call cost settings menu

Press 1 for Call cost limit
Press 2 to show costs in

Enter your preferred option:  """;
 
						System.out.println(callCostSettingsMenu);
						int callCostSettingsMenuOption = input.nextInt();

						switch(callCostSettingsMenuOption){

							case 1 -> System.out.println("You can now choose your preferred call cost limit");
							case 2 -> System.out.println("You can now choose your charging unit(units of currency)");
							
						}
					}
				
					case 8 -> System.out.println("You're now viewing your prepaid credit page");


				}

			}

			
			case 5 -> {

				String tonesMenu = """

Tones menu

Press 1 for Ringing tone
Press 2 for Ringing volume
Press 3 for Incoming call alert
Press 4 for Message alert tone
Press 5 for Keypad tones
Press 6 for Warning tones
Press 7 for Vibrating alert
Press 8 for Screen saver

Enter your preferred option:  """;
 
				System.out.println(tonesMenu);
				int tonesMenuOption = input.nextInt();

				switch(tonesMenuOption){

					case 1 -> System.out.println("You can now choose your ringing tone");
					case 2 -> System.out.println("You can now adjust your ringing volume");
					case 3 -> System.out.println("You can now adjust your incoming call alert");
					case 4 -> System.out.println("You can now choose your message alert tone");
					case 5 -> System.out.println("You can now adjust your keypad volume");
					case 6 -> System.out.println("You can now choose your warning tones");
					case 7 -> System.out.println("You can now adjust vibrating alert");
					case 8 -> System.out.println("You can now choose the picture shown on standby mode");


				}

			}

			case 6 -> {
				String settingsMenu = """

Settings menu

Press 1 for Call settings
Press 2 for Phone settings
Press 3 for Security settings
Press 4 for Restore factory settings

Enter your preferred option:  """;
 
				System.out.println(settingsMenu);
				int settingsMenuOption = input.nextInt();

				switch(settingsMenuOption){

					case 1 -> {

						String callSettingsMenu = """

Call settings menu

Press 1 for Automatic redial
Press 2 for Speed dialling
Press 3 for Call waiting options
Press 4 for Own number sending
Press 5 for Phone line in use
Press 6 for Automatic answer

Enter your preferred option:  """;
 
						System.out.println(callSettingsMenu);
						int callSettingsMenuOption = input.nextInt();

						switch(callSettingsMenuOption){

							case 1 -> System.out.println("You can now set automatic redial");
							case 2 -> System.out.println("You can now turn speed dialling on or off");
							case 3 -> System.out.println("You can now manage your call waiting options");
							case 4 -> System.out.println("You can now choose whether your number is shown when you call");
							case 5 -> System.out.println("You can now choose which phone line to use");
							case 6 -> System.out.println("You can now set your phone to answer an incoming call after one ring");

						}

					}

					case 2 -> {

						String phoneSettingsMenu = """

Phone settings menu

Press 1 for Language
Press 2 for Cell info display
Press 3 for Welcome note
Press 4 for Network selection
Press 5 to confirm SIM service actions

Enter your preferred option:  """;
 
						System.out.println(phoneSettingsMenu);
						int phoneSettingsMenuOption = input.nextInt();

						switch(phoneSettingsMenuOption){

							case 1 -> System.out.println("You can now select your preferred language");
							case 2 -> System.out.println("You can now set phone to indicate when it's used in a cellular network");
							case 3 -> System.out.println("You can now write a welcome note to be displayed when the phone is switched on");
							case 4 -> System.out.println("You can now select your preferred network");
							case 5 -> System.out.println("You can set the phone to show or hide confirmation messages when you use SIM services");

						}



					}
				
					case 3 -> {

						String securitySettingsMenu = """

Security settings menu

Press 1 for PIN code request
Press 2 for Call barring service
Press 3 for Fixed dialling
Press 4 for Closed user group
Press 5 for Security level
Press 6 to change access codes

Enter your preferred option:  """;
 
						System.out.println(securitySettingsMenu);
						int securitySettingsMenuOption = input.nextInt();

						switch(securitySettingsMenuOption){

							case 1 -> System.out.println("You can now set your PIN");
							case 2 -> System.out.println("You can now manage the call barring service");
							case 3 -> System.out.println("You can now turn fixed dialling on or off");
							case 4 -> System.out.println("You can now choose who you can call and who can call you");
							case 5 -> System.out.println("You can set security level for new SIM cards");
							case 6 -> System.out.println("You can now change the security code, PIN code, PIN2 code, or barring password");


						}


					}

					case 4 -> System.out.println("You're about to restore your phone to its factory settings");

				}

			}

			
			case 7 -> System.out.println("You can now divert your calls");

			case 8 -> {

				String musicMenu = """

Music Menu

Press 1 for Music player
Press 2 for Radio
Press 3 for Recorder
Press 4 for Track list

Enter your preferred option:  """;
 
				System.out.println(musicMenu);
				int musicMenuOption = input.nextInt();

				switch(musicMenuOption){

					case 1 -> System.out.println("You can now turn the music player on or off");
					case 2 -> System.out.println("You can now listen to the radio. \nConnect a headset first");
					case 3 -> System.out.println("You can now choose how to record audio");
					case 4 -> System.out.println("You're now viewing the track list");				

				}

			
			}

			
			case 9 -> System.out.println("You're now viewing the games application");
			
			case 10 -> System.out.println("You're now using the calculator");

			case 11 -> System.out.println("You're now viewing your reminders");

			case 12 -> {

				String clockMenu = """

Clock menu

Press 1 for Alarm clock
Press 2 for Clock settings
Press 3 for Date setting
Press 4 for Stopwatch
Press 5 for Countdown timer
Press 6 for Auto update of date and time

Enter your preferred option:  """;
 
				System.out.println(clockMenu);
				int clockMenuOption = input.nextInt();

				switch(clockMenuOption){

					case 1 -> System.out.println("You can now set your alarm");
					case 2 -> System.out.println("You can now adjust your clock settings");
					case 3 -> System.out.println("You can now set the correct date");
					case 4 -> System.out.println("You can now measure time");
					case 5 -> System.out.println("You can now set the phone to sound an alarm after a certain period of time");
					case 6 -> System.out.println("You can now turn auto update of time and date on or off");


				}



			}

			case 13 -> System.out.println("You can now manage your profiles");

			case 14 -> System.out.println("You now have access to the various WAP services");
			
			case 15 -> System.out.println("Here are your SIM services");

			case 16 -> System.exit(0);

			default -> System.out.println("Invalid option!!!");

		}



	}


}