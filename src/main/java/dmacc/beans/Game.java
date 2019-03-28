package dmacc.beans;

import java.util.Random;

public class Game {
	private String player1;
	private String computerPlayer;
	private String winner;

	public Game() {
		super();
	}

	public Game(String player1) {
		super();
		this.player1 = player1;
		this.setComputerPlayer();
		this.determineWinner();
	}

	public String getPlayer1() {
		return player1;
	}

	public void setPlayer1(String player1) {
		this.player1 = player1;
	}

	public String getComputerPlayer() {
		return computerPlayer;
	}
	
	public void setComputerPlayer(String computerPlayer) {
		
	}
	
	@Override
	public String toString() {
		return "Game [player1=" + player1 + ", computerPlayer=" + computerPlayer + ", winner=" + winner + "]";
	}
	
	public void setComputerPlayer() {
		Random num = new Random();
		int answer = num.nextInt(5) + 1;
		String player;
		if(answer == 1) {
			player = "rock";
		}else if (answer == 2) {
			player = "paper";
		}else if (answer == 3){
			player = "scissors";
		}else if (answer == 4){
			player = "lizard";
		}else { 
			player = "spock";
		}
		this.setComputerPlayer(player);
		
		
	}
	
	public void setWinner(String winner) {
		this.winner = winner;
	}

	public void determineWinner() {
		// Win Strings for each possibility
		// Rock
		String rockWinsLizard = "Rock crushes Lizard.";
		String rockWinsScissors = "Rock crushes Scissors.";
		
		// Paper
		String paperWinsRock = "Paper covers Rock.";
		String paperWinsSpock = "Paper disproves Spock.";
		
		// Scissors
		String scissorsWinsPaper = "Scissors cuts Paper.";
		String scissorsWinsLizard = "Scissors decapitates Lizard.";
		

		// Lizard
		String lizardWinsSpock = "Lizard poisons Spock.";
		String lizardWinsPaper = "Lizard eats Paper.";
		
		// Spock
		String spockWinsRock = "Spock vaporizes Rock.";
		String spockWinsScissors = "Spock smashes Scissors.";
		
		// Player one wins
		String playerOneWins = "Player one wins!";
		
		// Player two wins
		String playerTwoWins = "Player two wins!";
		
		// Messages sent after winner decided
		String victoryMessage = rockWinsScissors;
		String enterValidOption = "Please enter a valid option:";
		String winnerMessage = playerOneWins;
		String possibleOptionsResponse = "Rock, paper, scissors, lizard, spock";
		String tieMessage = "Game ended in a tie.";
		String tieWinner = "Nobody wins today...";
		
		
		
			// Decided to do a nested switch statement as it seemed so much cleaner to me
			switch (player1) {
				case "rock":
					switch (computerPlayer) {
					// rock wins player one wins
						case "scissors":
							// Default condition
							break;
						case "lizard":
							victoryMessage = rockWinsLizard;
							break;
					// rock loses player two wins
						case "paper":
							victoryMessage = paperWinsRock;
							winnerMessage = playerTwoWins;
							break;
						case "spock":
							victoryMessage = spockWinsRock;
							winnerMessage = playerTwoWins;
							break;
						default:
							victoryMessage = tieMessage;
							winnerMessage = tieWinner;
					}
					break;
				case "paper":
					switch (computerPlayer) {
					// paper wins player one wins
						case "rock":
							victoryMessage = paperWinsRock;
							break;
						case "spock":
							victoryMessage = paperWinsSpock;
							break;
					// paper loses player two wins
						case "scissors":
							victoryMessage = scissorsWinsPaper;
							winnerMessage = playerTwoWins;
							break;
						case "lizard":
							victoryMessage = lizardWinsPaper;
							winnerMessage = playerTwoWins;
							break;
						default:
							victoryMessage = tieMessage;
							winnerMessage = tieWinner;
					}
					break;
				case "scissors":
					switch (computerPlayer) {
					// scissors wins player one wins
						case "paper":
							victoryMessage = scissorsWinsPaper;
							break;
						case "lizard":
							victoryMessage = scissorsWinsLizard;
							break;
					// scissors loses player two wins
						case "rock":
							// Default condition
							winnerMessage = playerTwoWins;
							break;
						case "spock":
							victoryMessage = spockWinsScissors;
							winnerMessage = playerTwoWins;
							break;
						default:
							victoryMessage = tieMessage;
							winnerMessage = tieWinner;
					}
					break;
				case "lizard":
					switch (computerPlayer) {
					// lizard wins player one wins
						case "paper":
							victoryMessage = lizardWinsPaper;
							break;
						case "spock":
							victoryMessage = lizardWinsSpock;
							break;
					// lizard loses player two wins
						case "scissors":
							victoryMessage = scissorsWinsLizard;
							winnerMessage = playerTwoWins;
							break;
						case "rock":
							victoryMessage = rockWinsLizard;
							winnerMessage = playerTwoWins;
							break;
						default:
							victoryMessage = tieMessage;
							winnerMessage = tieWinner;
					}
					break;
				case "spock":
					switch (computerPlayer) {
					// spock wins player one wins
						case "scissors":
							victoryMessage = spockWinsScissors;
							break;
						case "rock":
							victoryMessage = spockWinsRock;
							break;
					// spock loses player two wins
						case "paper":
							victoryMessage = paperWinsSpock;
							winnerMessage = playerTwoWins;
							break;
						case "lizard":
							victoryMessage = lizardWinsSpock;
							winnerMessage = playerTwoWins;
							break;
						default:
							victoryMessage = tieMessage;
							winnerMessage = tieWinner;
					}
					break;
			}
			victoryMessage = enterValidOption;
			winnerMessage = possibleOptionsResponse;
			

			this.setWinner(winner);
	}
	
}