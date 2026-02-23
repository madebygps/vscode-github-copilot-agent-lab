# Copilot Workspace Instructions

## Development Checklist

Before committing any changes, ensure:

- [ ] `./mvnw clean package` passes with no errors
- [ ] `./mvnw test` passes (when tests exist)
- [ ] Code follows Java conventions (camelCase for methods/fields, PascalCase for classes)
- [ ] No unused variables or imports

## Project Overview

**Soc Ops** is a Social Bingo game built with Spring Boot 3.4.2, Thymeleaf, and vanilla JavaScript. Players find people who match questions to mark squares and get 5 in a row.

## Architecture

```
socops/
├── src/main/java/com/socops/
│   ├── SocOpsApplication.java       # Spring Boot entry point
│   ├── web/
│   │   └── BingoRestController.java # Serves pages & REST endpoints
│   ├── model/
│   │   ├── BingoCell.java           # Single tile record
│   │   ├── PlayPhase.java           # Game phase enum
│   │   └── WinningStreak.java       # Winning line record
│   ├── service/
│   │   └── BoardAssembler.java      # Board generation & game logic
│   └── data/
│       └── IcebreakerPrompts.java   # Static question bank
├── src/main/resources/
│   ├── templates/game.html          # Thymeleaf template (all UI)
│   ├── static/css/app.css           # Tailwind-like utility CSS
│   └── application.properties       # Server config (port 8080)
└── src/test/java/com/socops/
    └── service/BoardAssemblerTests.java  # Unit tests
```

## Key Commands

```bash
cd socops
./mvnw clean package              # Build
./mvnw spring-boot:run            # Run dev server (port 8080)
./mvnw test                       # Run tests
```

## Styling

Uses custom CSS utility classes (Tailwind-like) in `src/main/resources/static/css/app.css`:
- Layout: `.flex`, `.grid`, `.items-center`
- Spacing: `.p-4`, `.mb-2`, `.mx-auto`
- Colors: `.bg-accent`, `.bg-marked`, `.text-gray-700`

## State Management

- Server generates board via REST API (`/api/bingo/fresh-board`)
- Client-side JavaScript manages game state with localStorage persistence
- Single-page app with lobby, active game, and victory views
- Thymeleaf renders the initial HTML; JS handles all interactivity
