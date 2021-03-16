package com.Dao;

import com.Models.CandidatEntity;

import java.util.List;

public interface DaoInterface {
    public CandidatEntity addCandidat(CandidatEntity candidatEntity);
    public CandidatEntity updateCandidat(CandidatEntity candidatEntity);
    public boolean deleteCandidat(int id);
    public CandidatEntity getCandidat(int id);
    public List<CandidatEntity> getCandidats();
}
