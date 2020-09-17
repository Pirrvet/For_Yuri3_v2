package com.example.for_yuri3;

public class Questions
{
    public static String[] nQuestions =
            {
                    "Какая планета в Солнечной системе самая большая?",
                    "Какая планета в Солнечной системе дальше всего от Солнца?",
                    "Какая планета в Солнечной системе ближе всего к Солнцу??",
                    "У какой планеты кольца?",
                    "На какую планету произошла первая посадка земного аппарата?",
                    "Какая планета больше всего пригодна для жилья?",
                    "Эта планета красная из-за оксида железа", "Эта планета - ледяной гигант"
            };
    public static String[][] nChoices =
            {
                    {"Земля", "Нептун", "Марс", "Юпитер"},
                    {"Луна", "Венера", "Сатурн", "Нептун"},
                    {"Юпитер", "Меркурий", "Уран", "Марс"},
                    {"Луна", "Нептун", "Солнце", "Сатурн"},
                    {"Юпитер", "Венера", "Уран", "Марс"},
                    {"Сатурн", "Юпитер", "Земля", "Меркурий"},
                    {"Луна", "Марс", "Венера", "Нептун"},
                    {"Земля", "Юпитер", "Уран", "Солнце"}

            };
    public static String[] nCorrectAnswers = {"Юпитер", "Нептун", "Меркурий", "Сатурн", "Венера", "Земля", "Марс", "Уран"};


    /*public String getQuestion(int a) {
        String question = nQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice = nChoices[a][0];
        return choice;
    }

    public String getChoice2(int a) {
        String choice = nChoices[a][1];
        return choice;
    }

    public String getChoice3(int a) {
        String choice = nChoices[a][2];
        return choice;
    }

    public String getChoice4(int a) {
        String choice = nChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a) {
        return nCorrectAnswers[a];
    }*/
}
