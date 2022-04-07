package GroupTwo.PodstawyB1.PodstawyB3;

public enum BMIStatus {
    Underweight("You're underweight"),
    Normal("You're normal"),
    Overweight("You're overweight"),
    Obese("You're obese");

    private String message;

    BMIStatus(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public static BMIStatus calculateBMI(double weight, double height) {
        double result = weight / (height * height); //height m2 - height times by itself
        if (result < 18.5) {
            return BMIStatus.Underweight;
        } else if (result < 24.9) {
            return BMIStatus.Normal;
        } else if (result < 29.9) {
            return BMIStatus.Overweight;
        } else if (result > 34.9) {
        }
        return BMIStatus.Obese;
    }
}
