Como usar:

Si usamos:

`gradle publishAll` 

Deberiamos tomar una configuracion creada como:

```
the<DevToPublications> {
    dir = …
}
```

O en todo caso:

```
tasks.register("nombre", DevToPublication::class.java) {
    file = …
    published = true|false
    title = "TDD with URM + Kotlin: Jump"
    description = "The next part on the approach to generate a URM interpreter using Kotlin and TDD"
    tags = [kotlin, tdd]
    cover_image: ""
    series = "TDD With URM and Kotlin"
}
```

