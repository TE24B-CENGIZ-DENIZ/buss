
void main() {
    while (true) {
        System.out.println("whould you like to ride the bus?");

        String answer = IO.readln("");

        String busplaces[] = { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" };
        int places_left = 20;
        float price = 29.990f;
        int date_of_birth = 0;
        if (answer == "yes") {

            System.out.println("ok here you go sit");
            for (int i = 0; i < busplaces.length; i++) {
                try {
                    date_of_birth = Integer.parseInt(IO.readln("your date of birth?: "));
                } catch (NumberFormatException e) {
                    IO.println("where you even born ? try on the next bus im bored");

                    return;

                }
                busplaces[i] = " "+ date_of_birth;
                --places_left; 
                IO.println( busplaces[i]);
            }
           
          

        } else if (answer == "no") {

            System.out.println("bye");
            continue;
        } else {
            System.out.println("what?");
            IO.readln("");

        }
        IO.println("total earnings so far =  " + (20 - places_left) * price + " $ ");
    }

}
