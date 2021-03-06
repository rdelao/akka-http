# extractRequestEntity

## Signature

@@signature [BasicDirectives.scala]($akka-http$/akka-http/src/main/scala/akka/http/scaladsl/server/directives/BasicDirectives.scala) { #extractRequestEntity }

## Description

Extracts the @unidoc[RequestEntity] from the @unidoc[RequestContext].

The directive returns a @unidoc[RequestEntity] without unmarshalling the request. To extract domain entity,
@ref[entity](../marshalling-directives/entity.md) should be used.

## Example

@@snip [BasicDirectivesExamplesSpec.scala]($test$/scala/docs/http/scaladsl/server/directives/BasicDirectivesExamplesSpec.scala) { #extractRequestEntity-example }