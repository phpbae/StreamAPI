# StreamAPI
Java 8 Stream API practice


<br>
Stream ? <br>
Stream은 data 처리를 지원하는 원천으로부터 원소들의 연속적인 배열입니다. <br>

1. 원소들의 연속적인 배열 : 
Stream은 특정 type의 구성된 연속적으로 접근 할 수 있는 interface를 제공 합니다. 이들 interface는Collection의 interface에 달리 수정, 저장하는것이 아니라, filtering 또는 mapping 과 같이 data를 연산처리를 합니다. Collection이 data에 관한 것이라면, stream은 연산에 관한 것 입니다.

2.원천 : 
배열, collection, I/O channel 에 만들어진 data 원천의 순서를 변경하지 않고그대로 보존 합니다.

3. data 처리 : 
Stream은 database 형태의 연산과 filter, map, sort, find과 같은 data 처리 연산을 지원합니다.이러한 stream 연산은 multi core CPU에서 동작 할 수 있는 parallel과 순차적인 연산으로 실행 될 수 있습니다.

4. pipelines : 
Stream의 중요한 특징으로 stream 연산은 다시 stream을 반환하면서, 연결이 되어, 좀 더 큰 연결을 형성합니다.(여러개의 스트림이 연결되어 있는 구조)
파이프라인에서, 최종 처리를 제외하고는 모두 중간 처리 스트림이다.

5. 내부순환 : 
Stream은 collection 과는 다르게, 해당하는연산을 내부적으로 순차적으로 실행 할 수 있습니다.
내부 반복자를 사용하므로, 병렬처리가 쉽다.(컬렉션 내부에서 요소들을 반복시킴)
