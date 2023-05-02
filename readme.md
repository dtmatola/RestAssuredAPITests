# David's Coding Test
* Requirements:
  * Create an automated acceptance test of the given API:
    * https://api.tmsandbox.co.nz/v1/Categories/6329/Details.json?catalogue=false
  * Acceptance Criteria:
    * AC#1: Name = "Home & garden"
    * AC#2: CanRelist = "true"
    * AC#3: The "Promotions" element with Name = "Feature" has a "Description" that contains the text "Better position in category"

# Pre-requisites:
* jav --version
  * openjdk 11.0.19 2023-04-18
  * OpenJDK Runtime Environment Homebrew (build 11.0.19+0)
  * OpenJDK 64-Bit Server VM Homebrew (build 11.0.19+0, mixed mode)
* mvn --version
  * Apache Maven 3.9.1 (2e178502fcdbffc201671fb2537d0cb4b4cc58f8)
  * Maven home: /opt/homebrew/Cellar/maven/3.9.1/libexec
* IntelliJ IDEA
  * Runtime version: 11.0.15+10-b2043.56 x86_64

# Coverage:
  * AC#1 - category_name_home_and_garden_exists
  * AC#2 - category_can_relist_enabled
  * AC#3 - category_promotion_feature_with_correct_description_exists

# How to run the test
* CLI
  * In base folder (/RestAssuredAPITests), where pom.xml is located, execute the ff. command:
    * mvn test -Dtest="testCategoryDetails"
* IntelliJ IDEA
  * Right click RestAssuredAPITests
    * Hover mouse cursor to Maven
    * Click Generate Sources and Update Folder
  * Right click testCategoryDetails class (/src/test/java/com/technical/examination/)
    * Click Run Test