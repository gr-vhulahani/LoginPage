# Login Page

## Description

A Java console application that authenticates users by validating their username and password against stored credentials. Features input validation and clean separation of concerns.

## Features
- User authentication with username and password validation
- Length validation (username ≥ 3 chars, password ≥ 8 chars)
- Whitespace trimming for usernames
- Clean, maintainable code structure with separated validation methods
- Resource management (scanner cleanup)

## Technologies
- Java 17
- Object-Oriented Programming (OOP)
- Maven (build tool)

## How to Run
1. Open the project in IntelliJ IDEA
2. Run `Main.java`
3. Enter username: `john`
4. Enter password: `janedoe1`

## Project Structure
```
src/main/java/
├── Main.java              # Entry point
├── LoginController.java   # Authentication logic
└── User.java              # User data model
```

## Code Quality Improvements
- ✅ Removed nested if-else statements for better readability
- ✅ Extracted validation logic into private helper methods
- ✅ Used constants for magic numbers
- ✅ Fixed critical setter bugs in User class
- ✅ Removed commented-out code and clutter
- ✅ Consistent naming conventions (camelCase)

## Future Improvements
- GUI with JavaFX or Swing
- Database integration for credential storage
- Password encryption/hashing
- User registration feature
- Login attempt limiting
