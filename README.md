# 🐱 Cosmo Cats Intergalactic Marketplace

Backend service for a fictional intergalactic marketplace selling cosmic products such as anti-gravity yarn balls and cosmic milk.

## 📌 Laboratory Work 1.1
**Course:** Java Web  
**Topic:** API Contract, Error Handling, DDD, CRUD, Validation

## 🎯 Goal
Design and implement a backend architecture for the Cosmo Cats Intergalactic Marketplace platform using Domain-Driven Design principles.  
The project includes API contract definition, validation, error handling, and CRUD operations using mock data.

## 🚀 Features
- CRUD operations for Product entity
- OpenAPI (Swagger) API Contract (YAML)
- Domain-Driven Design (DDD) architecture
- Jakarta Bean Validation
- Custom validation annotation (`@CosmicWordCheck`)
- Global error handling compliant with RFC 9457
- In-memory mock storage (no database)

## 🧠 Domain Model
- **Product** — cosmic goods sold on the marketplace
- **Category** — product grouping
- **Order** — customer orders
- **Cart** — shopping cart with selected products

## 📄 API Specification
The API contract is described using OpenAPI 3.0 and can be found here:
src/main/resources/api-specs/product-api.yml

The specification includes:
- CRUD endpoints for Product
- Request/response schemas
- Validation rules

## 🧪 Validation
### Standard validation
- `@NotNull`
- `@Size`
- `@DecimalMin`

### Custom validation
`@CosmicWordCheck` ensures that product names contain at least one cosmic keyword:
- `star`
- `galaxy`
- `comet`
- 
Example:
“galaxy milk” ✅
“space rock” ❌

## ⚠️ Error Handling
Validation and request errors are handled globally and follow **RFC 9457** structure:

```json
{
  "status": 400,
  "error": "Bad Request",
  "message": "Validation failed for object 'ProductDTO'",
  "path": "/api/products"
}
