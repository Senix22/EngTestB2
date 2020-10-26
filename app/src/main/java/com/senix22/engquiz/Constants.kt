package com.senix22.engquiz

object Constants {


    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "20"
    const val CORRECT_ANSWERS: String = "correct_answers"


    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1,
            "The taxi will be here in a couple of minutes. We …… get ready to go.",

            "had better",
            "would better",
            "should better",
            1
        )

        questionsList.add(que1)


        val que2 = Question(2,
            "The interviewer started off …… me why I wanted the job.",

            "to ask",
            "in asking",
            "sby asking",
            3)
        questionsList.add(que2)

        val que3 = Question(3,
            "The stairs …… quite steep, so be careful how you go down.",

            "are",
            "be",
            "is",
            1)
        questionsList.add(que3)


        val que4 = Question(4,
            "Michael Jordan is visiting our school next week to talk about basketball.” “You mean …… Michael Jordan? Can you get his autograph for me?",

            "–",
            "the",
            "a",
            2)
        questionsList.add(que4)

        val que5 = Question(5,
            "Dad won’t mind us borrowing the car, will he?” “No, I …….",

            "don’t suppose it",
            "suppose not",
            "don’t suppose",
            2)
        questionsList.add(que5)

        val que6 = Question(6,
            "We …… to the tennis club since we moved here.",

            "have belonged",
            "are belonging",
            "belong",
            1)
        questionsList.add(que6)


        val que7 = Question(7,
            "Your eyes are red – ……?",

            "did you cry",
            "have you cried",
            "have you been crying",
            3)
        questionsList.add(que7)


        val que8 = Question(8,
            "I don’t know when Helen …… back.",

            "will be",
            "is",
            "can",
            1)
        questionsList.add(que8)

        val que9 = Question(9,
            "I …… an interview because I’d worked there before.",

            "needn’t have",
            "didn’t need to have",
            "needn’t have had",
            3)
        questionsList.add(que9)

        val que10 = Question(10,
            "When I asked what was wrong, ……",

            "I was explained the problem",
            "the problem was explained to me",
            "he explained me the problem",
            2)
        questionsList.add(que10)

        val que11 = Question(11,
            "Steven …… the wallet.",

            "admitted to steal",
            "admitted steal",
            "admitted stealing",
            3)
        questionsList.add(que11)

        val que12 = Question(12,
            "…… to Paris during the vacation.",

            "They are all going",
            "All they are going",
            "They all are going",
            1)
        questionsList.add(que12)


        val que13 = Question(13,
            "We should use …… time we have available to discuss John’s proposal.",

            "the little of",
            "the little",
            "little",
            2)
        questionsList.add(que13)

        val que14 = Question(14,
            "Some experience is …… for the job.",

            "really essential",
            "fairly essential",
            "very essential",
            1)
        questionsList.add(que14)

        val que15 = Question(15,
            "She was …… as anyone could have had.",

            "as patient teacher",
            "a patient as teacher",
            "as patient a teacher",
            3)
        questionsList.add(que15)

        val que16 = Question(16,
            "…… Derek nowadays, he’s so busy at the office",

            "Hardly we ever see",
            "We hardly ever see",
            "We see hardly ever",
            2)
        questionsList.add(que16)

        val que17 = Question(17,
            "…… in my seventies and rather unfit, I might consider taking up squash.",

            "Were I not",
            "Was I not",
            "If I wasn't",
            1)
        questionsList.add(que17)

        val que18 = Question(18,
            "We were delayed …… an accident.",

            "because",
            "because of",
            "of because",
            2)
        questionsList.add(que18)

        val que19 = Question(19,
            "…… that Marie was able to retire at the age of 50.",

            "So successful her business was",
            "So was her successful business",
            "So successful was her business",
            3)
        questionsList.add(que19)

        val que20 = Question(20,
            "…… they slept soundly.",

            "Hot though the night air was",
            "Hot though was the night air",
            "Hot although the night air was",
            1)
        questionsList.add(que20)


        return questionsList
    }
}