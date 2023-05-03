# Documentation

This documentation will serve as a guide on how to setup the environment and execute the tests.

## Requirements

The goal is to create an automated acceptance tests of the following API:

```
https://api.tmsandbox.co.nz/v1/Categories/6329/Details.json?catalogue=false
```

### Acceptance Criteria

1. Name = "Home & garden"
2. CanRelist = "true"
3. The "Promotions" element with Name = "Feature" has a "Description" that contains the text "Better position in category"

## Setting up the environment

Install the required dependencies:

Java 11 (using Homebrew)
```
brew update
brew search openjdk
brew install openjdk@11
sudo ln -sfn /usr/local/opt/openjdk@11/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk-11.jdk
java --version
```

Maven (using Homebrew)

```
brew install maven
```

IntelliJ IDEA
* You can install this one by downloading the installer from their repository.

## Coverage

1. AC#1 - category_name_home_and_garden_exists
2. AC#2 - category_can_relist_enabled
3. AC#3 - category_promotion_feature_with_correct_description_exists

## How to Run the test

Cloning the repository
```
git clone https://github.com/dtmatola/RestAssuredAPITests.git
```

Go to base directory
```
cd RestAssuredAPITests
```

In base folder (/RestAssuredAPITests), where pom.xml is located, execute the ff. command:
```
mvn test -Dtest="testCategoryDetails"
```