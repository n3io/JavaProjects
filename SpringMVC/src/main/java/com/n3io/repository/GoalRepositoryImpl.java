package com.n3io.repository;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.n3io.model.Goal;
import com.n3io.model.GoalReport;

@Repository("goalRepository")
@Transactional
public class GoalRepositoryImpl implements GoalRepository {

	@Autowired
	SessionFactory session;
	
	public Goal save(Goal goal) {
		session.getCurrentSession().saveOrUpdate(goal);
		return goal;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<Goal> loadAll(){
		Query query = (Query) session.getCurrentSession().createQuery("Select g from Goal g");
		List goals = query.list();
		
		return goals;		
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<GoalReport> findAllGoalReports() {
		/*Query query = (Query) session.getCurrentSession()
								.createQuery("Select new com.n3io.model.GoalReport(g.minutes, e.minutes, e.activity) " + 
											"from Goal g, Exercise e where g.id = e.goal.id");*/
		Query query  =  session.getCurrentSession().getNamedQuery(Goal.FIND_GOAL_REPORTS);
		
		return query.list();
	}
}
