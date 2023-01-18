package objects;

public class Body {
    public Body() {

    }

    public class Lips {
        public String name;
        public Lips() {
            this.name = name;
        }

    }
    public class Finger {
        public String name;

        public Finger() {
            this.name = name;
        }
    }

    public String up(Body.Finger  body) {
        return "поднял " + body.name;
    }



}
