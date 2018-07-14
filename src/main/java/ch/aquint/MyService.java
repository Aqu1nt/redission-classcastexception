package ch.aquint;

import org.redisson.api.RLiveObjectService;
import org.redisson.api.RedissonClient;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class MyService {

  private RLiveObjectService redissonLiveObjectService;

  public MyService(RedissonClient redisson) {
    this.redissonLiveObjectService = redisson.getLiveObjectService();
  }

  @PostConstruct
  public void initService() {
    MyLiveObject myLiveObject = this.redissonLiveObjectService.merge(new MyLiveObject());
    myLiveObject.setValue("Hello World");
    System.out.println(myLiveObject.getValue());
  }
}
