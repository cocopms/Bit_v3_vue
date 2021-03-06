package com.domainname.web.ServiceImpls;

import com.domainname.web.domains.PlayerDTO;
import com.domainname.web.mappers.PlayerMapper;
import com.domainname.web.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    PlayerMapper playerMapper;

    @Override
    public List<PlayerDTO> retrieveAll() {
        return playerMapper.selectAll();
    }
}
