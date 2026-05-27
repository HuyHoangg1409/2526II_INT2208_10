public class Bank {
    public static String classifyProfile(int age, float income, int credit_score, char employment) {
        if (age < 18 || age > 65 || income < 5.0 || income > 500.0 || credit_score < 300 || credit_score > 850
                || (employment != 'C' && employment != 'F')) {
            return "Invalid Input";
        }

        if (credit_score >= 300 && credit_score <= 500) {
            return "REJECT";
        }

        if (income < 15.0) {
            if (employment == 'F') {
                return "REJECT";
            }

            if (credit_score >= 501 && credit_score <= 700) {
                return "REJECT";
            }
            return "MANUAL REVIEW";
        }

        else {
            if (employment == 'C') {
                return "APPROVE";
            } else {
                return "MANUAL REVIEW";
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Bank classify profile");
    }
}
