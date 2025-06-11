# Java Player Registration System 🎲

A comprehensive Java application for managing player registration and gaming activities with dice rolling functionality.

## 📁 Project Structure

```
src/
├── lib/
│   ├── Player.java          # Player class with dice rolling capabilities
│   ├── Register.java        # Registration management system
│   ├── Name.java           # Name handling utility (dependency)
│   ├── PairOfDice.java     # Dice rolling implementation (dependency)
│   └── Rollable.java       # Interface for rollable objects (dependency)
└── main/
    ├── PlayerApp.java      # Player application logic
    └── RegisterApp.java    # Registration application logic
```

## 🎯 Features

### Player Management
- **Player Creation**: Create players with names, gamer tags, and dice
- **Dice Rolling**: Integrated dice rolling functionality for gaming
- **Gamer Tag Generation**: Automatic gamer tag creation based on player names
- **Name Formatting**: Proper case formatting for player names
- **Comparison**: Player sorting and comparison capabilities

### Registration System
- **Name Storage**: Efficient storage and management of player names
- **Search Functionality**: Search by first name initials
- **Capacity Management**: Configurable registration limits
- **Sorting**: Automatic name sorting capabilities
- **Bulk Operations**: Add multiple names at once

### Application Logic
- **Player Filtering**: Find players based on gamer tag patterns
- **Email Generation**: Generate email addresses from player names
- **Data Processing**: Advanced filtering and string manipulation

## 🚀 Key Classes

### Player Class
```java
// Main player entity with comprehensive functionality
public class Player implements Rollable, Comparable<Player>
```

**Features:**
- Name and gamer tag management
- Dice rolling integration
- Automatic gamer tag generation
- Player comparison and sorting
- Full name parsing and formatting

**Key Methods:**
- `generateGamerTag(int number)` - Creates unique gamer tags
- `setFullPlayerName(String name)` - Parses and formats full names
- `rollDice()` - Rolls the player's dice
- `compareTo(Player other)` - Enables player sorting

### Register Class
```java
// Registration management system
public class Register implements Iterable<Name>
```

**Features:**
- Dynamic name storage with capacity limits
- Search and filter operations
- Bulk name operations
- Iterator support for easy traversal
- Automatic sorting capabilities

**Key Methods:**
- `addName(Name n)` - Add individual names
- `addNames(ArrayList<Name> n)` - Bulk name addition
- `searchRegisterByFirstNameInitial(char initial)` - Search functionality
- `countFirstNameOccurrences(String firstName)` - Count name occurrences
- `sortRegister()` - Sort all registered names

## 🎮 Application Examples

### PlayerApp
Filters players based on gamer tag patterns:
```java
public static String execute(ArrayList<Player> participants, int number)
```
- Finds players whose gamer tags contain their family name
- Filters by gamer tag ending with specific number
- Returns formatted player information

### RegisterApp
Generates email addresses from registered names:
```java
public static String execute(Name nm, Register regst)
```
- Removes and adds names to registration
- Generates emails for names containing 'a' or 'e'
- Creates standardized email format

## 🔧 Usage Examples

### Creating and Managing Players
```java
// Create a player with name and gamer tag
Name playerName = new Name("John", "Doe");
Player player = new Player(playerName, "johndoe123");

// Generate automatic gamer tag
player.setFullPlayerName("TIM JONES");
player.generateGamerTag(42); // Creates "senojtmit42"

// Roll dice and get score
player.rollDice();
int score = player.getScore();
```

### Registration Management
```java
// Create registration system
Register register = new Register(50); // Capacity of 50

// Add names
register.addName(new Name("Alice", "Smith"));
register.addName(new Name("Bob", "Johnson"));

// Search and count
boolean hasA = register.searchRegisterByFirstNameInitial('A');
int aliceCount = register.countFirstNameOccurrences("Alice");

// Sort names
register.sortRegister();
```

## 📋 Requirements

- **Java Version**: Java 8 or higher
- **Dependencies**: 
  - `Name.java` class
  - `PairOfDice.java` class  
  - `Rollable.java` interface

## 🏗️ Compilation and Execution

```bash
# Compile all classes
javac -d bin src/lib/*.java src/main/*.java

# Run applications (examples)
java -cp bin main.PlayerApp
java -cp bin main.RegisterApp
```

## 🎨 Design Patterns Used

- **Composition**: Player composed of Name and Rollable objects
- **Interface Implementation**: Rollable and Comparable interfaces
- **Iterator Pattern**: Register implements Iterable
- **Builder Pattern**: StringBuilder for string construction
- **Template Method**: Consistent method naming and structure

## 🧪 Testing Features

The system includes various methods suitable for unit testing:
- Name validation and formatting
- Gamer tag generation algorithms
- Registration capacity management
- Search and filter functionality
- Dice rolling mechanics

## 📊 Sample Output

### Player Information
```
Player:[name=John Doe, dices=PairOfDice:[die1=3, die2=5], gamerTag=eodnhoj42]
```

### Generated Emails
```
j.smi@email.com
a.joh@email.com
```

### Filtered Players
```
JOHN, doe
ALICE, smith
```

## 🔄 Future Enhancements

Potential improvements for the system:
- Database integration for persistent storage
- GUI interface for user interaction
- Advanced dice game implementations
- Tournament management features
- Player statistics tracking
- Network multiplayer capabilities

## 📝 Code Quality Features

- **Comprehensive Documentation**: Detailed JavaDoc comments
- **Error Handling**: Boundary checking and validation
- **Clean Code**: Clear naming conventions and structure
- **Modularity**: Well-separated concerns and responsibilities
- **Extensibility**: Interface-based design for easy extension

## 🤝 Contributing

To contribute to this project:
1. Fork the repository
2. Create a feature branch
3. Add comprehensive tests
4. Follow existing code style
5. Submit a pull request

## 📄 License

This project is open source. Feel free to use and modify as needed.

---
*Student ID: P2716927*  
*Built with Java ☕*
