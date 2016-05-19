package com.cloud.dc.service.modules;

import java.util.List;

public interface UserService {
	
	<E> Object resetPwd(E pwdPair);
	
	<E> Object login(E credentials);
	
	<E> Object registerParticipates(List<E> users);
	
	<E> Object newPwd(E pwdPair);
	
	<E> Object mailToMe(E mailAddress);

}
