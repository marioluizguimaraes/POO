public class Boneco {

    public static String boneco(int l, int c){
        String[][] boneco = new String[5][5];

        boneco[0][0] = " "; boneco[0][1] = " "; boneco[0][2] = "_"; boneco[0][3] = "_"; boneco[0][4] = " ";

        boneco[1][0] = " "; boneco[1][1] = "|"; boneco[1][2] = " "; boneco[1][3] = " "; boneco[1][4] = "|";

        boneco[2][0] = "\\"; boneco[2][1] = "O"; boneco[2][2] = "/"; boneco[2][3] = " "; boneco[2][4] = "|";

        boneco[3][0] = "("; boneco[3][1] = " "; boneco[3][2] = ")"; boneco[3][3] = " "; boneco[3][4] = "|";

        boneco[4][0] = "/"; boneco[4][1] = " "; boneco[4][2] = "\\"; boneco[4][3] = " "; boneco[4][4] = "|";

        return boneco[l][c];
    }
}
