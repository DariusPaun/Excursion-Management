# Xcursionist – Event & Excursion Management Platform

Xcursionist is a full-stack web application designed for managing excursions, events, attractions, organizers, employees, and customer-related actions inside a tourism platform.

The project combines a **Spring Boot backend** with a **Next.js frontend**, offering both administrative and user-oriented functionality such as event browsing, ticket purchasing, account creation, event editing, data visualization, and database-related management.

## Overview

The application was built to support the core workflows of an excursion management platform. It allows users and administrators to interact with event data, attractions, purchases, organizers, employees, and excursionists through a modern web interface connected to a Java backend.

From the project structure, the platform includes dedicated frontend pages for:
- database management
- employee creation
- account creation
- ticket purchasing
- event viewing
- login
- event editing
- statistics

This suggests a system with both operational and administrative capabilities.

## Main Features

- Browse and manage events
- View and manage attractions
- Create user accounts
- Create employees
- Buy tickets for events
- Update event-related data
- Work with organizer and excursionist information
- Display statistics and structured data in the UI
- Connect frontend actions to backend business logic through REST communication

## Tech Stack

### Backend
- Java
- Spring Boot
- Spring Web
- DTO-based request/response handling
- Layered architecture with controller, service, repository, and entity classes

### Frontend
- Next.js
- React
- Tailwind CSS
- Reusable UI components
- Custom hooks and utility helpers

## Project Scope

This is not just a simple CRUD backend. The project appears to cover a wider business flow around excursion administration, including:
- event lifecycle operations
- attraction handling
- account-related actions
- purchase flows
- organizer and employee management
- statistics and data display pages

The separation between frontend and backend makes the application easier to maintain and extend.

## Frontend Notes

The frontend is located in the `client/xcursionist` folder and is structured using the Next.js App Router style.  
It includes multiple pages and reusable components such as cards, tables, sidebar navigation, charts, dialogs, inputs, and other UI elements.

This indicates a more complete user interface rather than a minimal demo application.

## Backend Notes

The backend is located in `project_backend/demo` and follows a standard Spring Boot layered structure.  
Based on the available classes, it includes:
- DTOs for transferring structured data
- entities representing the domain model
- repositories for database interaction
- services for business logic
- a centralized controller layer
- CORS configuration for frontend integration

The backend is designed to serve the frontend and process the main business operations of the platform.


