# David's Coding Test
* Requirement:
  * Create automated acceptance tests of the given API:
    * API: https://api.tmsandbox.co.nz/v1/Categories/6329/Details.json?catalogue=false
  * Acceptance Criteria:
    * Name = "Home & garden"
    * CanRelist = "true"
    * The "Promotions" element with Name = "Feature" has a Description that contains the text "Better position in category"

# Pre-requisites/Software versions used:
* java --version
  * openjdk 11.0.19 2023-04-18
  * OpenJDK Runtime Environment Homebrew (build 11.0.19+0)
  * OpenJDK 64-Bit Server VM Homebrew (build 11.0.19+0, mixed mode)
* mvn --version
  * Apache Maven 3.9.1 (2e178502fcdbffc201671fb2537d0cb4b4cc58f8)
  * Maven home: /opt/homebrew/Cellar/maven/3.9.1/libexec
* IntelliJ IDE
  * Runtime version: 11.0.15+10-b2043.56 x86_64

# Coverage:
* Acceptance Criteria:
  * Name = "Home & garden"
    * covered in category_name_home_and_garden_exists()
  * CanRelist = "true"
    * covered in category_can_relist_enabled
  * The "Promotions" element with Name = "Feature" has a Description that contains the text "Better position in category"
    * covered in category_promotion_feature_with_correct_description_exists

# How to Run the test
* CLI
  * mvn test -Dtest="testCategoryDetails"
* IDE
  * Right click RestAssuredAPITests folder
  * Hover cursor to Maven
  * Click Generate Sources and Update Folders
  * Right click testCategoryDetails class (located in src/test/java/com.technical.examination/)
  * Click Run

# Results
[INFO] Results:
[INFO]
[INFO] Tests run: 3, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  23.779 s
