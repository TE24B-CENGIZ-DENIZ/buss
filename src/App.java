import java.io.IOError;

void main() {
    while (true) {
        System.out.println("whould you like to ride the bus?");

        String answer = IO.readln("");

        String busplaces[] = { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" };
        int places_left = 20;
        float price = 29.990f;
        int date_of_birth = 0;
        if (answer.equals("yes")) {
            boolean booked_place = false;
            for (int i = 0; i < busplaces.length; i++) {

                System.out.println("where would you like to book(numb from 0-19)");
                String booking = IO.readln("choose your place: ");

                int booked_place_num = Integer.parseInt(booking);

                try {
                    booked_place_num = Integer.parseInt(booking);
                } catch (NumberFormatException g) {
                    IO.println("not a place in this bus ");
                    return;
                }

                
                // kolla att index inte är bokat
                if (booked_place_num == --i && booked_place == true) {
                    IO.println("booked");
                    return;
                }

                try {
                    date_of_birth = Integer.parseInt(IO.readln("your date of birth?: "));
                    busplaces[i] = " " + date_of_birth; // lägg in bokning i array bussplaces
                    booked_place = true;
                } catch (NumberFormatException e) {
                    IO.println("where you even born ? try on the next bus im bored");
                    break;
                }

                --places_left;
                // IO.println(busplaces[i]);

            }

        } else if (answer.equals("no")) {

            System.out.println("bye");
            continue;
        } else {
            System.out.println("what?");
            IO.readln("");

        }
        IO.println("total earnings so far =  " + (20 - places_left) * price + " $ ");
        IO.println("you have " + (20 - places_left) + " passanger(s) ");

        // for(String places: busplaces){
        // IO.println(places);

        // }
        // : means for each item
        for (int i = 0; i < busplaces.length; i++) {
            IO.println(busplaces[i]);

        }
    }

}
