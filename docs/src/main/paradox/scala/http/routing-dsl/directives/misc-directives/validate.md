# validate

## Signature

@@signature [MiscDirectives.scala]($akka-http$/akka-http/src/main/scala/akka/http/scaladsl/server/directives/MiscDirectives.scala) { #validate }

## Description

Allows validating a precondition before handling a route.

Checks an arbitrary condition and passes control to the inner route if it returns `true`.
Otherwise, rejects the request with a @unidoc[ValidationRejection] containing the given error message.

## Example

@@snip [MiscDirectivesExamplesSpec.scala]($test$/scala/docs/http/scaladsl/server/directives/MiscDirectivesExamplesSpec.scala) { #validate-example }