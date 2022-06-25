# demo-service

Getting K8S and Helm

Tools:

- [KIND](https://kind.sigs.k8s.io/)

### Creating image

```bash
    mvn package
```

```bash
    docker build -t matheuscruzdev/demo:0.2.0 .
```

### Publishing docker image

```
    docker push matheuscruzdev/demo:0.2.0
```

### Creating cluster K8S

```bash
    kind create cluster --config=k8s/kind.yaml --name=demo
```

### Creating POD

```bash
    kubectl apply -f k8s/pod.yaml
```

### Accessing demo-service

```bash
    kubectl port-forward pod/demo-service 8080:8080
```

[Testing here...](http://localhost:8080/apps?name=java) 

### Packagin helm package

```bash
    helm package ./helm
```

### Installing helm package

```bash
    helm install demo ./helm/demo-service-0.1.0.tgz
```

### Accessing demo-service-svc

```bash
    kubectl port-forward svc/demo-service-svc 8080
```