package builder.game;

public class Score {
    private int score = 0;
    
    public void addPoints(int points) {
        score += points;
    }
    
    public int getScore() {
        return score;
    }
}

// public class Player {
//     private String name;
//     private int score;

//     public Player(String name) {
//         this.name = name;
//         this.score = 0;
//     }

//     public void updateScore(Character character) {
//         int attributeSum = character.getAttributes().stream().mapToInt(Attribute::getValue).sum();
//         this.score += attributeSum;
//     }

//     public String getName() {
//         return name;
//     }

//     public int getScore() {
//         return score;
//     }
// }



