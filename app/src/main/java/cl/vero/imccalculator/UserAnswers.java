package cl.vero.imccalculator;

public class UserAnswers {

    public int sexRg;
    public String userName;
    public int userWeight;
    public int userHeight;

    public UserAnswers(int sexRg, String userName, int userHeight, int userWeight){
        this.sexRg = sexRg;
        this.userName = userName;
        this.userHeight = userHeight;
        this.userWeight = userWeight;
    }

    public int getSexRg() {
        return sexRg;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserWeight() {
        return userWeight;
    }

    public int getUserHeight() {
        return userHeight;
    }
}
