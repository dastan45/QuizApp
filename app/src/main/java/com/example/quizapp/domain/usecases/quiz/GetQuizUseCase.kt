package com.example.quizapp.domain.usecases.quiz

import com.example.quizapp.domain.repositories.quiz.QuizRepository
import javax.inject.Inject

class GetQuizUseCase @Inject constructor(private val repository: QuizRepository) {

    operator fun invoke(
        amount: Int?,
        category: Int?,
        difficulty: String?
    ) = repository.getQuiz(amount, category, difficulty)

}