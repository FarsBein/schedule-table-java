public class Main {
    public static void main(String[] args) {
        Math math = new Math("MTH110");
        Science science = new Science("BLG143");
        Computer Computer1 = new Computer("CPS109");
        Computer Computer2 = new Computer("CPS310");
        Art art = new Art("ARB201");

        String[] content = {math.content(), science.content(), Computer1.content(), Computer2.content(), art.content()};

        Schedule schedule = new Schedule(content);

        System.out.println(schedule);

    }
}