# About
- To be able to create an account and log in as a seller, you must be a University of Indonesia student using an SSO UI account
- An e-commerce project that uses a website as an application for sellers to manage their selling products and a mobile application for customers to buy products
- This project applies the microservices concept which consists of 3 backend projects using Springboot, 1 web frontend project using Springboot and Tailwind CSS, and 1 mobile frontend project using Flutter

---

# How to run this project from localhost without Docker
1. Clone the whole project 
2. Go to each project folder (catalog, order, user, frontend, frontend_mobile) and build Gradle to get dependencies
3. In each project folder, copy the contents of the .env.example file and create .env file with the copied contents
4. Match port `5432` to your local PostgreSQL port in the `jdbc:postgresql://localhost:5432/...`
5. If you use dev profile in application.properties, create three databases with the following names
   - apapedia-user
   - apapedia-catalog
   - apapedia-order
6. Run each project
7. Open `http://localhost:8083` from your browser