package top.kxyu.springbootjava.service.impl;

import org.springframework.stereotype.Service;
import top.kxyu.springbootjava.service.VideoService;

/**
 * @INFO:
 * @author: KXY
 * @Date: Created in 2020/2/19 23:52
 */
@Service
public class VideoServiceImpl implements VideoService {
	@Override
	public String Say(String name) {
		return name+"Hi";
	}
}
