package minesweeper.application

import minesweeper.view.InputView
import minesweeper.view.OutputView

class Application {
    private val inputView = InputView()
    private val outputView = OutputView()

    fun run() {
        val height = inputView.inputHeight()
        val width = inputView.inputWidth()
        val minesCount = inputView.inputMinesCount()
    }
}