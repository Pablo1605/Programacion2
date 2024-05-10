package com.example.demo.entities.audit;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistance.GeneratedValue;
import javax.persistance.GenerationType;
import javax.persistance.id;
import javax.persistance.SequenceGenerator;
import javax.persistance.Table;
import javax.persistance.Temporal;
import javax.persistance.TemporalType;

import com.example.demo.config.CustomRevisionListener;
import jakarta.persistence.*;
import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionNumber;
import org.hibernate.envers.RevisionTimestamp;

import lombok.Data;

@Entity
@Table(CustomRevisionListener.class)
@Data
public class Revision implements Serializable{
    private static final long serialversionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "revision_seq")
    @SequenceGenerator(
            name="revision_seq",
            sequenceName = "rbac.seq_revision_id"
    )
    @RevisionNumber
    private int id;

    @Column(name="REVISION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @RevisionTimestamp
    private Date date;
}
