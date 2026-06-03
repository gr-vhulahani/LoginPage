# Day 1
- Created project structure
- Validation handling in the main method
- Created User class to store user details

## Feature: Validate user input

- receives username first, and looks for it in the "database" and if it is not there a message is shown to indicate that user does not exist.
- if username and password is incorrect a message is shown to indicate that it is incorrect.
- reads the length of the input of the username and if it is less than 3 and message is shown to indicate that it is too short.
- reads the length of the input of the password and if it is less than 8 and message is shown to indicate that it is too short.
- User.java stores the details of the user and a method is called to extract that information.

## Things I learned
- to send input from a scanner directly to the method so that it can be processed
- why the 'this' keyword is used
- setters need a parameters to receive the input
- using 'public' and 'void' keyword to make sure we can access them from the main method

# Day 2
(Previous work - to be documented)

# Day 3 - Code Refactoring & Quality Improvements

## Bug Fixes
- ✅ Fixed critical setter bug in `User.setUsername()` - was setting wrong field
- ✅ Fixed circular assignment in `User.setPassword()` - parameter wasn't being stored
- ✅ Renamed fields from snake_case to camelCase for consistency

## Code Quality Improvements
- ✅ Refactored deeply nested if-else statements in LoginController
- ✅ Extracted validation logic into 4 private helper methods:
  - `isValidUsername()`
  - `isUsernameMatch()`
  - `isValidPassword()`
  - `isPasswordMatch()`
- ✅ Added constants for magic numbers (MIN_USERNAME_LENGTH, MIN_PASSWORD_LENGTH)
- ✅ Implemented early returns instead of nested conditions (pyramid of doom pattern)
- ✅ Used meaningful error message for failed password match
- ✅ Added resource cleanup (scanner.close())
- ✅ Cleaned up Main.java - removed all commented-out code
- ✅ Simplified User.java - removed excessive decorative comments

## Design Patterns Applied
- **Single Responsibility Principle** - each method has one clear purpose
- **Early Returns** - fail fast approach for better readability
- **Constants** - DRY principle for validation thresholds

## Code Metrics Before/After
- **Main.java**: 47 lines → 5 lines (89% reduction in clutter)
- **LoginController.java**: 36 lines → 59 lines (more readable, better structured)
- **User.java**: 53 lines → 35 lines (cleaner, simplified)
- **Cyclomatic Complexity**: Reduced from deeply nested to linear flow

## Things I learned
- Importance of code review and identifying bugs in setters
- How to flatten nested conditionals for better readability
- Value of extracting helper methods to improve maintainability
- Resource management in Java (scanner cleanup)
- Consistent naming conventions improve code quality
