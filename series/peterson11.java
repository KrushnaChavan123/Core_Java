class Peterson11 {
    public static void main(String[] args) {
        for (int num = 1; num <= 100; num++) {
            int originalNum = num;
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                int factorial = 1;

                // Calculate the factorial of the digit
                for (int i = 1; i <= digit; i++) {
                    factorial *= i;
                }

                sum += factorial;
                num /= 10;
            }

            if (originalNum == sum) {
                System.out.println("Peterson number: " + originalNum);
            }
        }
    }
}
