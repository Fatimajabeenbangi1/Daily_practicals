public class HotelBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int roomType;
        int nights;
        double totalCost;
        final double singleRoomRate = 100.0;
        final double doubleRoomRate = 150.0;
        final double suiteRoomRate = 250.0;
        String choice="3";

        do {
            System.out.println("Welcome to Hotel Booking System");
            System.out.println("Please select the room type:");
            System.out.println("1. Single Room ($100 per night)");
            System.out.println("2. Double Room ($150 per night)");
            System.out.println("3. Suite ($250 per night)");
            System.out.print("Enter your choice (1-3): ");
            roomType = scanner.nextInt();

            switch (roomType) {
                case 1:
                    System.out.println("You selected Single Room.");
                    System.out.print("Enter the number of nights: ");
                    nights = scanner.nextInt();
                    totalCost = nights * singleRoomRate;
                    break;

                case 2:
                    System.out.println("You selected Double Room.");
                    System.out.print("Enter the number of nights: ");
                    nights = scanner.nextInt();
                    totalCost = nights * doubleRoomRate;
                    break;

                case 3:
                    System.out.println("You selected Suite.");
                    System.out.print("Enter the number of nights: ");
                    nights = scanner.nextInt();
                    totalCost = nights * suiteRoomRate;
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid room type.");
                    continue; // Skip the rest of the loop if an invalid choice was made
            }

            System.out.println("Total cost for your stay: $" + totalCost);

            System.out.print("Do you want to make another booking? (y/n): ");
            choice = scanner.next();
        } while (choice.charAt(0) == 'y' || choice.charAt(0) == 'Y');

       
       
    }
}