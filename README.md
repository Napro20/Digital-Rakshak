# Digital Rakshak - ডিজিটাল রক্ষক

**Your Personal Cyber Guardian**  
An interactive full-stack cybersecurity awareness & defense game that helps you learn and fight real-world cyber threats through quizzes, simulations, score tracking, and chatbot guidance.

[**Play the Game Online (Dev Mode)**](http://localhost:5173/)  
[**Backend API Base URL (Dev)**](http://localhost:8080/api)

---

## Project Overview

**Digital Rakshak** is a modern, full-stack educational game designed to make cybersecurity learning fun, engaging, and practical.  
Players face quizzes, attack/defend simulations, story-based challenges, and get real-time hints from an integrated chatbot — all while earning points, saving progress, and competing on the leaderboard.

Perfect for students, beginners, teachers, and anyone who wants to become a **digital rakshak** (protector) in today's online world.

---

## Features

- Dynamic quizzes loaded from backend database
- Realistic attack & defend simulations (Phishing, SQL Injection, Brute Force, etc.)
- Score tracking & progress saving (persisted in backend)
- Leaderboard to compete with others
- Integrated Botpress chatbot for hints & explanations
- Responsive UI — works on desktop and mobile
- Full-stack architecture with secure REST APIs
- Clean, modern design with Tailwind CSS

---

## Topics Covered

### Beginner Level
- Introduction to Cybersecurity
- Password Strength Testing
- Two-Factor Authentication (2FA)
- Cyber Hygiene Simulator

### Intermediate Level
- Phishing Defense Simulator
- Encryption & Decryption Challenge
- Digital Footprint Awareness

### Advanced Level
- SQL Injection Defense Game
- Man-in-the-Middle (MITM) Attack Simulation
- Brute Force Attack Defense
- Cross-Site Scripting (XSS) Prevention

---

## Technologies Used

- **Frontend**: React, TypeScript, Vite, Tailwind CSS
- **Backend**: Spring Boot (Java), Spring Data JPA, H2 Database (dev), REST APIs
- **Chatbot**: Botpress integration
- **Database**: H2 (development), easily switch to PostgreSQL/MySQL
- **Version Control & Hosting**: Git, GitHub
- **Build Tools**: Maven (backend), npm/Vite (frontend)

---

## Installation & Run (Development)

### Prerequisites
- Java 17+ (for backend)
- Node.js 18+ & npm (for frontend)
- Git

### 1. Clone your repository
```bash
git clone https://github.com/Napro20/Digital-Rakshak.git
cd Digital-Rakshak
