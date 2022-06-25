# demo-service

Getting K8S and Helm

Tools:

- [KIND](https://kind.sigs.k8s.io/)

### Creating image

```bash
    mvn package
```

```bash
    docker build -t matheuscruzdev/demo:latest .
```

### Publishing docker image

```
    docker push matheuscruzdev/latest
```

## Helm

### Packaging

```bash
    helm package ./helm
```

### Installing

```bash
    helm install demo ./helm/demo-service-0.1.0.tgz
```

### Accessing demo-service

```bash
    kubectl port-forward svc/demo-service 8080:8080
```

[Testing here...](http://localhost:8080/apps?name=java) 

