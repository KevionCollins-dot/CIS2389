  class Die {

    - faceValue: Integer

    + roll(): void

    + getFaceValue(): Integer

  }


  class Player {

    - name: String

    - scorecard: Scorecard

    + rollDice(): void

    + selectCategory(category: Category): void

  }


  class Scorecard {

    - scoreList: List<Category>

- overallScore: Integer

    + calculateCategoryScore(category: Category, dice: List<Die>): Integer

    + isCategoryAvailable(category: Category): Boolean

  }


  <<abstract>>class Category {

    - name: String

    - value: Integer

    <<abstract>> + isMatch(dice: List<Die>): Boolean

  }



  class Game {

    - players: List<Player>

    - currentPlayer: Player

    - dice: List<Die>

    + startGame(): void

    + nextTurn(): void

    + isGameOver(): Boolean

    + declareWinner(): void

  }