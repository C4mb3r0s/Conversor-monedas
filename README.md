# Conversor de Monedas

Command-line currency converter that fetches live exchange rates from the ExchangeRate-API and converts between USD and four Latin American currencies through an interactive numbered menu.

---

## Technologies

| Technology | Detail |
|---|---|
| Java | 11+ |
| Java HttpClient (built-in) | HTTP calls to ExchangeRate-API v6 |
| Gson (Google) | JSON parsing |
| ExchangeRate-API v6 | Live exchange rate data source |

---

## Project Structure

```
Conversor-monedas/
├── Conversor.iml
├── src/
│   ├── Main.java
│   └── APIService.java
└── out/
```

---

## Features

Interactive CLI menu with 8 conversion options:

| Option | Conversion |
|---|---|
| 1 | USD → ARS (Argentine Peso) |
| 2 | ARS → USD |
| 3 | USD → BRL (Brazilian Real) |
| 4 | BRL → USD |
| 5 | USD → COP (Colombian Peso) |
| 6 | COP → USD |
| 7 | USD → MXN (Mexican Peso) |
| 8 | MXN → USD |

---

## Getting Started

### Prerequisites

- Java 11 or higher
- An API key from [ExchangeRate-API](https://www.exchangerate-api.com/)

### Environment Variables

```bash
export EXCHANGE_API_KEY=your_api_key_here
```

Get a free API key at [exchangerate-api.com](https://www.exchangerate-api.com/).

### Run

Compile and run with:

```bash
javac src/Main.java src/APIService.java -d out
java -cp out Main
```

---

## Author

**C4mb3r0s** — [github.com/C4mb3r0s](https://github.com/C4mb3r0s)
