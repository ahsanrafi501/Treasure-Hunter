Treasure Hunter: A 2D Adventure Game

Overview

Treasure Hunter is a simple yet exciting 2D adventure game developed in Java. Players navigate through challenging levels to solve puzzles, avoid obstacles, and uncover hidden treasures. The game features smooth gameplay, dynamic visuals, and is built for an immersive gaming experience.

This repository contains the complete source code for the game, including the main entry point, game logic, and graphical interface.

Features

Engaging Gameplay: Navigate maps, solve puzzles, and collect treasures.

Smooth Performance: Optimized Java code ensures responsive and seamless play.

Dynamic Design: Customizable levels with increasing difficulty.

Simple Graphics: Clean and polished 2D visuals to enhance the gaming experience.

Cross-Platform Compatibility: Runs on any system with Java support.

Getting Started

Follow these instructions to run the game on your local machine.

Prerequisites

Java Development Kit (JDK): Make sure you have JDK 8 or above installed on your system.

IDE (Optional): Use an IDE like IntelliJ IDEA, Eclipse, or NetBeans for easier code navigation.

Installation

Clone this repository to your local machine:

git clone https://github.com/yourusername/treasure-hunter.git

Navigate to the project directory:

cd treasure-hunter

Compile the Java files:

javac Main/Main.java

Run the game:

java Main.Main

Code Structure

The main entry point for the game is the Main class located in the Main package. Below is the Main class code:

package Main;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("2D Adventure");
        
        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);
        
        window.pack();
        
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gamePanel.setupGame();
        
        gamePanel.startGameThread();
    }
}

Explanation:

JFrame Setup: Creates the game window with a title, non-resizable property, and close operation.

GamePanel Integration: Adds the GamePanel (the core game logic and visuals) to the window.

Game Initialization:

setupGame(): Prepares the game, such as initializing levels or assets.

startGameThread(): Starts the main game loop for smooth and continuous gameplay.

Contributions

Contributions are welcome! If you'd like to improve the game or fix bugs, please follow these steps:

Fork the repository.

Create a new branch:

git checkout -b feature/your-feature-name

Commit your changes:

git commit -m "Add your message here"

Push to the branch:

git push origin feature/your-feature-name

Submit a pull request.

License

This project is licensed under the MIT License. Feel free to use, modify, and distribute the game as long as proper credit is given.

Acknowledgments

Thanks to the Java Swing framework for providing the tools to create the graphical user interface.

Inspired by classic 2D games that bring fun and challenges to players.

Enjoy the game and happy treasure hunting! ✨
