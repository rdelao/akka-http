# extractActorSystem

## Description

Extracts the @unidoc[ActorSystem] from the @unidoc[RequestContext], which can be useful when the external API
in your route needs one.

@@@ warning
This is only supported when the available Materializer is an ActorMaterializer.
@@@

## Example

@@snip [BasicDirectivesExamplesTest.java]($test$/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java) { #extractActorSystem }
