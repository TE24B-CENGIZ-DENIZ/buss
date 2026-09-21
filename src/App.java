
void main() {
    while (true) {
        System.out.println("whould you like to ride the bus?");

        String answer = IO.readln("");

        String busplaces[] = { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" };
        int places_left = 20;
        float price = 29.990f;
        int date_of_birth = 0;
        if (answer.equals("yes")) {

            for (int i = 0; i < busplaces.length; i++) {
                // kolla att index inte är bokat

                if (places_left > 0) {
                    IO.println("you can now book a place");
                }

                try {
                    date_of_birth = Integer.parseInt(IO.readln("your date of birth?: "));
                    busplaces[i] = " " + date_of_birth; // lägg in bokning i array bussplaces

                } catch (NumberFormatException e) {
                    IO.println("where you even born ? try on the next bus im bored");
                    break;
                }

                --places_left;
                // IO.println(busplaces[i]);

                IO.println("total earnings so far =  " + (20 - places_left) * price + " $ ");
                IO.println("bus has " + (20 - places_left) + " passanger(s) ");

            }

        } else if (answer.equals("no")) {

            System.out.println("bye");
            return;
        } else {
            System.out.println("what?");
            IO.readln("");

        }

        for (int e = 0; e < busplaces.length; e++) {
            IO.println(busplaces[e]);

        }
        

        // for(String places: busplaces){
        // IO.println(places);

        // }
        // : means for each item

        if (places_left == 0) {
            IO.println("all the places are booked");
            break;
        }

    }

}
