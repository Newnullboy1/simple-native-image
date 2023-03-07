FROM gcr.io/distroless/base

ARG APP_FILE=native-image
EXPOSE 8080

COPY target/${APP_FILE} app
ENTRYPOINT ["/app"]