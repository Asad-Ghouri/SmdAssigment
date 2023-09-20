interface Player {
    void printInfo();
    int getRanking();
}

class Cricketer implements Player {
    private String name;
    private int age;
    private String nationality;

    public Cricketer(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    @Override
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Nationality: " + nationality);
    }

    @Override
    public int getRanking() {
        return 0; // Default ranking for Cricketers
    }
}

class Batsman implements Player {
    private int score;
    private int batsmanRanking;

    public Batsman(int score, int batsmanRanking) {
        this.score = score;
        this.batsmanRanking = batsmanRanking;
    }

    @Override
    public void printInfo() {
        System.out.println("Score: " + score);
        System.out.println("Batsman Ranking: " + batsmanRanking);
    }

    @Override
    public int getRanking() {
        return batsmanRanking;
    }
}

class Bowler implements Player {
    private int wickets;
    private int bowlerRanking;

    public Bowler(int wickets, int bowlerRanking) {
        this.wickets = wickets;
        this.bowlerRanking = bowlerRanking;
    }

    @Override
    public void printInfo() {
        System.out.println("Wickets: " + wickets);
        System.out.println("Bowler Ranking: " + bowlerRanking);
    }

    @Override
    public int getRanking() {
        return bowlerRanking;
    }
}

class Allrounder implements Player {
    private Batsman batsman;
    private Bowler bowler;
    private int ranking;

    public Allrounder(Batsman batsman, Bowler bowler, int ranking) {
        this.batsman = batsman;
        this.bowler = bowler;
        this.ranking = ranking;
    }

    @Override
    public void printInfo() {
        batsman.printInfo();
        bowler.printInfo();
        System.out.println("Allrounder Ranking: " + ranking);
    }

    @Override
    public int getRanking() {
        return ranking;
    }
}

public class Main {
    public static void main(String[] args) {
        Batsman batsman = new Batsman(1000, 1);
        Bowler bowler = new Bowler(50, 3);
        Allrounder allrounder = new Allrounder(batsman, bowler, 5);

        allrounder.printInfo();
        System.out.println("Allrounder Ranking: " + allrounder.getRanking());
    }
}
