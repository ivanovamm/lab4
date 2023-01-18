package enums;

public enum Mood {
    IN_GOOD_MOOD("в отличном настроении"), CHEERFUL("была бодрая"), DISMAL("угрюмо"), PLEASED(" был доволен обедом"), SLEEPY(""), NO(""), AGREE("был согласен"), TIRED(" был уставший");
    private String name;

    Mood(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
