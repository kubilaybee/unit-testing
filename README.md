# JUnit 5 Core Annotations and Concepts

JUnit 5 is one of the most popular and powerful frameworks for writing unit tests in Java. Below you'll find the most fundamental annotations and concepts from the code examples you provided.

### Annotations

**`@Test`**

- **Definition:** Indicates that a method is a test method to be run by the JUnit framework.
- **Purpose:** It allows JUnit to recognize and include the method in test reports. Each test method should test an independent scenario.

**`@BeforeEach`**

- **Definition:** Marks a method that will run once before each test method in the same class.
- **Purpose:** Used for tasks like preparing a clean starting environment for each test or initializing common test data or objects. For example, it is ideal for creating a new `MyMath` object before each test.

**`@AfterEach`**

- **Definition:** Marks a method that will run once after each test method in the same class.
- **Purpose:** Used for tasks like cleaning up resources or resetting the environment after a test has finished.

**`@BeforeAll`**

- **Definition:** Marks a static method that will run only once before all test methods in the given class.
- **Purpose:** Used for tasks like initializing costly resources that are shared across all tests (e.g., a database connection or a file reader). This method must be static.

**`@AfterAll`**

- **Definition:** Marks a static method that will run only once after all test methods in the given class have finished.
- **Purpose:** Used to clean up the shared resources that were initialized by `@BeforeAll`. This method must also be static.

### Core Concepts and Methods

**Assertions**

- **Definition:** These are static methods used to verify the expected results of a test.
- **Purpose:** They check if a condition is `true` or `false` to determine if the test has `passed` or `failed`. They are the heart of all test methods.
- **Examples:**
    - `assertEquals(expected, actual)`: Verifies that the expected value is equal to the actual value.
    - `assertTrue(condition)`: Asserts that a condition is `true`.
    - `assertFalse(condition)`: Asserts that a condition is `false`.
    - `assertArrayEquals(expectedArray, actualArray)`: Checks if the elements and order of two arrays are the same.

**Test Lifecycle**

- **Definition:** A set of stages that determine the execution order of a test class. Annotations like `@BeforeAll`, `@BeforeEach`, `@AfterEach`, and `@AfterAll` are used to manage this lifecycle.
- **Purpose:** Provides an isolated and predictable environment for each test. For example, it prevents one test from affecting the result of another.

**Class Under Test**

- **Definition:** This is the class that contains the actual code being tested. In your example, the `MyMath` class was used to test whether its `calculateSum` method works correctly.
- **Purpose:** It contains the functional code with the application's business logic.

**Test Class**

- **Definition:** This is the class that contains the tests and is usually named after the class being tested (like `MyMathTest`).
- **Purpose:** It contains the test scenarios and assertion logic to test the methods of a specific class (e.g., `MyMath`).
