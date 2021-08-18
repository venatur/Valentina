package com.example.valentina

object Constants {
    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()
        val que1 = Question(id=1, question="What color is?", R.drawable.ic_launcher_background,"red",opt2 = "blue",opt3="black","white",1)
        questionList.add(que1)
        return questionList
    }
}