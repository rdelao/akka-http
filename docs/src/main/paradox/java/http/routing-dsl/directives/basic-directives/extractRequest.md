# extractRequest

## Description

Extracts the complete @unidoc[HttpRequest] instance.

Use `extractRequest` to extract just the complete URI of the request. Usually there's little use of
extracting the complete request because extracting of most of the aspects of HttpRequests is handled by specialized
directives. See @ref[Request Directives](../by-trait.md#request-directives-java).

## Example

@@snip [BasicDirectivesExamplesTest.java]($test$/java/docs/http/javadsl/server/directives/BasicDirectivesExamplesTest.java) { #extractRequest }