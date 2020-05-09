# Queue
## 큐
  - 큐는 삽입 삭제가 양 끝에서 각각 수행하는 자료구조다. 
  - 선입 선출 원칙에 의해 삽입 삭제를 수행한다. 
  - 큐는 뒤에서 삽입하고 앞에서 삭제 연산을 수행한다. 
  - 그래서 큐의 가장앞의 item을 가리키는 변수 front와 가장 뒤 rear가 필요하다. 
  - 큐를 배열로 만들게 되면 추가/삭제 만큼 이동을 해야 되는데 이를 보완하기 위해 배열을 원형으로 만든다. 
  - rear 다음의 비어있는 원소의 인덱스는 rear = (rear+1)%N으로 계산한다.
  - 삭제할때 주의해야 할점은 item을 삭제할 때마다 큐가 empty가 되는지 검사하고, 만일 empty라면 front = rear = 0으로 되게 하자. 
  - 위 방법은 효율성면에선 좋지 않다. 그럼 어떻게 보완을 해야 할까? 삭제할 떄마다 큐가 empty인지 검사 안하는 방법이 있을까?
  - front를 실제 가장 앞에 있는 item의 바로 앞의 비어있는 원소를 가리키게 하면 된다. 
  - 이로써 배열의 크기가 N이라면 실제 N-1개의 공간들을 item들이 차지하게 된다. 
  - 이방법으로 삭제 후 empty가 되면 front = rear의 상태가 된다. 
  - ArrayQueue.class
    - add()는 삽입할 빈 자리가 있는지 확인한다. (rear+1)%q.length가 front와 같으면 오버플로우.
    - resize()가 좀 다르다
    >
            private void resize(int len) {
                 Object[] newQ = new Object[len];
                 for(int i=0, j=front+1; i<len+1; i++,j++) {
                     newQ[i] = q[j%q.length];
                 }
                 front = 0;
                 rear = size;
                 q = (E[]) newQ;
            }
            
  - ListQueue.class
    - 삽입 시 연결리스트가 empty인 경우 front가 새 노드르 가리키도록 한다.
    - empty가 아닌경우 rear가 참조하는 노드의 next가 새 노드를 가리키도록 하자.
  - 큐 사용 범위
    - CPU 스케줄링, 네트워크 프린터, 실시간 시스템 인터럽트처리, 이진트리의 레벨순회, 너비우선탐색에 사용된다. 
  - 수행시간
    - 배열로 구현한 큐의 add/remove는 O(1)시간을 갖는다.
    - 단순 연결리스트로 구현한 큐의 add/remove 는 O(1) 시간이 걸린다. 